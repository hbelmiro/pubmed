package com.thegreatapi;

import java.util.Objects;

final class Article {

    private final String pmid;

    Article(String pmid) {
        Objects.requireNonNull(pmid);
        this.pmid = pmid;
    }

    public String getPmid() {
        return pmid;
    }

    @Override
    public String toString() {
        return "Article{" +
                "pmid='" + pmid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var article = (Article) o;
        return pmid.equals(article.pmid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmid);
    }
}
