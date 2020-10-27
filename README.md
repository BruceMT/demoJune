# demoJune
demo of project in Marlabs
This project called Health Tracking System, It is a standalone web application that patients and doctors can use it to monitor patients personal health when patients home. Patients can record their daily activities on this application. Doctors can view whether patients achieve the rehabilitation goals and provide advice to patients.
## SSO partten
'''
(A) After the user opens the client, the client asks the user for authorization.

(B) The user agrees to authorize the client.

(C) The client uses the authorization obtained in the previous step to apply for a token from the authentication server.

(D) After the authentication server authenticates the client, it confirms that it is correct and agrees to issue a token.

(E) The client uses the token to apply to the resource server for resources.

(F) The resource server confirms that the token is correct and agrees to open the resource to the client.
'''
# Mail sender
'''
the doctor can send their advices to the patients via the e-mail -> the Java Mail Sender API.
'''
# Microserivce
'''
the Rest API based on the Micro-services architecture using Spring Boort2, Spring Data JPA and Spring Cloud.

Use Spring Cloud Eureka to manage these services and Worked with Netflix Zuul API gateway for authentication
and using Hystrix circuit breaker for fault tolerance, and Ribbon as load balancer

'''
