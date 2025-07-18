package zag.sm.report.service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import zag.library.session.api.service.RequestContext;
import zag.sm.report.model.vto.UserResultSet;

import java.util.List;

import static zag.library.session.core.model.enums.CommonRequestContextKeys.USER_TOKEN;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final RestTemplate restTemplate;
    private final RequestContext context;

    @Override
    public UserResultSet getUsersByIds(List<Long> usersIds) {

        String token = context.get(USER_TOKEN, String.class);
        //System.out.println(token);

        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:9104/users")
                .queryParam("ids", usersIds)
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<UserResultSet> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                UserResultSet.class
        );

        return responseEntity.getBody();

    }

//    @Override
//    public LightUserVTO getUserById(Long userId) {
//
//        String token = context.get(USER_TOKEN, String.class);
//
//        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:9104/user")
//                .queryParam("id", userId)
//                .toUriString();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + token);
//
//        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
//
//        ResponseEntity<LightUserVTO> responseEntity = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                requestEntity,
//                LightUserVTO.class
//        );
//
//        return responseEntity.getBody();
//    }



}
