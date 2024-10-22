package com.provectus.kafka.ui.config.auth;

import java.util.Collection;
import java.util.Map;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public record RbacOidcUser(OidcUser user, Collection<String> groups) implements RbacUser, OidcUser, UserDetails {

  @Override
  public Map<String, Object> getClaims() {
    return user.getClaims();
  }

  @Override
  public OidcUserInfo getUserInfo() {
    return user.getUserInfo();
  }

  @Override
  public OidcIdToken getIdToken() {
    return user.getIdToken();
  }

  @Override
  public Map<String, Object> getAttributes() {
    return user.getAttributes();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return user.getAuthorities();
  }

  @Override
  public String getName() {
    return user.getName();
  }

  @Override
  public String name() {
    return user.getName();
  }

  @Override
  public String getPassword() {
    // Return null or implement as needed
    return null;
  }

  @Override
  public String getUsername() {
    // Return the username used to authenticate the user
    return user.getName();
  }

  @Override
  public boolean isAccountNonExpired() {
    // Indicate whether the user's account has expired
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // Indicate whether the user is locked or unlocked
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // Indicate whether the user's credentials (password) has expired
    return true;
  }

  @Override
  public boolean isEnabled() {
    // Indicate whether the user is enabled or disabled
    return true;
  }
}
