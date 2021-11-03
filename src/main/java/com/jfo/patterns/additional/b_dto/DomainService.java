package com.jfo.patterns.additional.b_dto;

public class DomainService {

    public DomainObjectDto getData(){
        DomainObject domainObject = getDomainObject();
        DomainObjectDto dto = new DomainObjectDto();
        dto.setaProperty(domainObject.getaProperty());
        return dto;
    }

    private DomainObject getDomainObject() {
        DomainObject domainObject = new DomainObject();
        domainObject.setaProperty("Dummy property");
        domainObject.setConfidential("Confidential property");
        return domainObject;
    }
}
