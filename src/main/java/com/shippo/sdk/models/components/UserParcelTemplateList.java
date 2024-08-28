/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UserParcelTemplateList {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends List<UserParcelTemplate>> results;

    @JsonCreator
    public UserParcelTemplateList(
            @JsonProperty("results") Optional<? extends List<UserParcelTemplate>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
    }
    
    public UserParcelTemplateList() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<UserParcelTemplate>> results() {
        return (Optional<List<UserParcelTemplate>>) results;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UserParcelTemplateList withResults(List<UserParcelTemplate> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public UserParcelTemplateList withResults(Optional<? extends List<UserParcelTemplate>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserParcelTemplateList other = (UserParcelTemplateList) o;
        return 
            Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserParcelTemplateList.class,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<UserParcelTemplate>> results = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder results(List<UserParcelTemplate> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends List<UserParcelTemplate>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public UserParcelTemplateList build() {
            return new UserParcelTemplateList(
                results);
        }
    }
}

