package com.shivendra.code.spaces.workspacewebapp.models;

public enum Position {
    SECURITY, HOUSEKEEPING, RECEPTION, CONCIERGE;

    @Override
    public String toString() {
        switch (this){
            case SECURITY:
                return "Security";
            case CONCIERGE:
                return "Concierge";
            case RECEPTION:
                return "Reception";
            case HOUSEKEEPING:
                return "Housekeeping";
        }
        return "";
    }
}
