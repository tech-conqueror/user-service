package com.techconqueror.user.audit;

import jakarta.annotation.Nonnull;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class StaticAuditorAware implements AuditorAware<String> {

    @Override
    public @Nonnull Optional<String> getCurrentAuditor() {
        return Optional.of("admin");
    }
}
