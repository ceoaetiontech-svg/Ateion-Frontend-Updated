@Configuration
public class WebConfig implements WebMvcConfigurer {

    // This pulls the value from your Render Environment Variables
    // Defaulting to localhost if not found
    @Value("${ALLOWED_ORIGINS:http://localhost:5173}")
    private String allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(allowedOrigins.split(",")) // Supports multiple URLs
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}