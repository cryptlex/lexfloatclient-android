package com.cryptlex.android.lexfloatclient;

public class LexFloatClientException extends Exception {

    int errorCode;

    public LexFloatClientException(String message) {
        super(message);
    }

    public LexFloatClientException(int errorCode) {
        super(getErrorMessage(errorCode));
        this.errorCode = errorCode;
    }

    public int getCode() {
        return this.errorCode;
    }

    public static String getErrorMessage(int errorCode) {
        String message;
        switch (errorCode) {
        case LF_E_PRODUCT_ID:
            message = "The product id is incorrect.";
            break;
        case LF_E_CALLBACK:
            message = "Invalid or missing callback function.";
            break;
        case LF_E_HOST_URL:
            message = "Missing or invalid server url.";
            break;
        case LF_E_TIME:
            message = "Ensure system date and time settings are correct.";
            break;
        case LF_E_INET:
            message = "Failed to connect to the server due to network error.";
            break;
        case LF_E_NO_LICENSE:
            message = "License has not been leased yet.";
            break;
        case LF_E_LICENSE_EXISTS:
            message = "License has already been leased.";
            break;
        case LF_E_LICENSE_NOT_FOUND:
            message = "License does not exist on server or has already expired.";
            break;
        case LF_E_LICENSE_EXPIRED_INET:
            message = "License lease has expired due to network error.";
            break;
        case LF_E_LICENSE_LIMIT_REACHED:
            message = "The server has reached it's allowed limit of floating licenses.";
            break;
        case LF_E_BUFFER_SIZE:
            message = "The buffer size was smaller than required.";
            break;
        case LF_E_METADATA_KEY_NOT_FOUND:
            message = "The metadata key does not exist.";
            break;
        case LF_E_METADATA_KEY_LENGTH:
            message = "Metadata key length is more than 256 characters.";
            break;
        case LF_E_METADATA_VALUE_LENGTH:
            message = "Metadata value length is more than 4096 characters.";
            break;
        case LF_E_FLOATING_CLIENT_METADATA_LIMIT:
            message = "The floating client has reached it's metadata fields limit.";
            break;
        case LF_E_METER_ATTRIBUTE_NOT_FOUND:
            message = "The meter attribute does not exist.";
            break;
        case LF_E_METER_ATTRIBUTE_USES_LIMIT_REACHED:
            message = "The meter attribute has reached it's usage limit.";
            break;
        case LF_E_PRODUCT_VERSION_NOT_LINKED:
            message = "No product version is linked with the license.";
            break;
        case LF_E_FEATURE_FLAG_NOT_FOUND:
            message = "The product version feature flag does not exist."; 
            break;
        case LF_E_IP:
            message = "IP address is not allowed.";
            break;
        case LF_E_SYSTEM_PERMISSION:
            message = "Insufficient system permissions.";
            break;
        case LF_E_INVALID_PERMISSION_FLAG:
            message = "Invalid permission flag.";
            break;
        case LF_E_OFFLINE_FLOATING_LICENSE_NOT_ALLOWED:
            message = "Offline floating license is not allowed for per-instance leasing strategy.";
            break;
        case LF_E_MAX_OFFLINE_LEASE_DURATION_EXCEEDED:
            message = "Maximum offline lease duration exceeded.";
            break;
        case LF_E_ALLOWED_OFFLINE_FLOATING_CLIENTS_LIMIT_REACHED:
            message = "Allowed offline floating clients limit reached.";
            break;
        case LF_E_WMIC:
            message = "Fingerprint couldn't be generated because Windows Management Instrumentation (WMI) service has been disabled.";
            break;
        case LF_E_MACHINE_FINGERPRINT:
            message = "Machine fingerprint has changed since activation.";
            break;
        case LF_E_ENTITLEMENT_SET_NOT_LINKED:
            message = "No entitlement set is linked to the license.";
            break;
        case LF_E_FEATURE_ENTITLEMENT_NOT_FOUND:
            message = "The feature entitlement does not exist.";
            break;
        case LF_E_CLIENT:
            message = "Client error.";
            break;
        case LF_E_SERVER:
            message = "Server error.";
            break;
        case LF_E_SERVER_TIME_MODIFIED:
            message = "System time on server has been tampered with.";
            break;
        case LF_E_SERVER_LICENSE_NOT_ACTIVATED:
            message = "The server has not been activated using a license key.";
            break;
        case LF_E_SERVER_LICENSE_EXPIRED:
            message = "The server license has expired.";
            break;
        case LF_E_SERVER_LICENSE_SUSPENDED:
            message = "The server license has been suspended.";
            break;
        case LF_E_SERVER_LICENSE_GRACE_PERIOD_OVER:
            message = "The grace period for server license is over.";
            break;     
        case LF_E_PROXY_NOT_TRUSTED:
            message = "Request blocked due to untrusted proxy.";
            break;
        default:
            message = "Unknown error!";
        }
        return message;
    }
    /*
     * CODE: LF_OK
     * 
     * MESSAGE: Success code.
     */
    public static final int LF_OK = 0;

    /*
     * CODE: LF_FAIL
     * 
     * MESSAGE: Failure code.
     */
    public static final int LF_FAIL = 1;

    /*
     * CODE: LF_E_PRODUCT_ID
     * 
     * MESSAGE: The product id is incorrect.
     */
    public static final int LF_E_PRODUCT_ID = 40;

    /*
     * CODE: LF_E_CALLBACK
     * 
     * MESSAGE: Invalid or missing callback function.
     */
    public static final int LF_E_CALLBACK = 41;

    /*
     * CODE: LF_E_HOST_URL
     * 
     * MESSAGE: Missing or invalid server url.
     */
    public static final int LF_E_HOST_URL = 42;

    /*
     * CODE: LF_E_TIME
     * 
     * MESSAGE: Ensure system date and time settings are correct.
     */
    public static final int LF_E_TIME = 43;

    /*
     * CODE: LF_E_INET
     * 
     * MESSAGE: Failed to connect to the server due to network error.
     */
    public static final int LF_E_INET = 44;

    /*
     * CODE: LF_E_NO_LICENSE
     * 
     * MESSAGE: License has not been leased yet.
     */
    public static final int LF_E_NO_LICENSE = 45;

    /*
     * CODE: LF_E_LICENSE_EXISTS
     * 
     * MESSAGE: License has already been leased.
     */
    public static final int LF_E_LICENSE_EXISTS = 46;

    /*
     * CODE: LF_E_LICENSE_NOT_FOUND
     * 
     * MESSAGE: License does not exist on server or has already expired. This
     * happens when the request to refresh the license is delayed.
     */
    public static final int LF_E_LICENSE_NOT_FOUND = 47;

    /*
     * CODE: LF_E_LICENSE_EXPIRED_INET
     * 
     * MESSAGE: License lease has expired due to network error. This happens when
     * the request to refresh the license fails due to network error.
     */
    public static final int LF_E_LICENSE_EXPIRED_INET = 48;

    /*
     * CODE: LF_E_LICENSE_LIMIT_REACHED
     * 
     * MESSAGE: The server has reached it's allowed limit of floating licenses.
     */
    public static final int LF_E_LICENSE_LIMIT_REACHED = 49;

    /*
     * CODE: LF_E_BUFFER_SIZE
     * 
     * MESSAGE: The buffer size was smaller than required.
     */
    public static final int LF_E_BUFFER_SIZE = 50;

    /*
     * CODE: LF_E_METADATA_KEY_NOT_FOUND
     * 
     * MESSAGE: The metadata key does not exist.
     */
    public static final int LF_E_METADATA_KEY_NOT_FOUND = 51;

    /*
     * CODE: LF_E_METADATA_KEY_LENGTH
     * 
     * MESSAGE: Metadata key length is more than 256 characters.
     */
    public static final int LF_E_METADATA_KEY_LENGTH = 52;

    /*
     * CODE: LF_E_METADATA_VALUE_LENGTH
     * 
     * MESSAGE: Metadata value length is more than 4096 characters.
     */
    public static final int LF_E_METADATA_VALUE_LENGTH = 53;

    /*
     * CODE: LF_E_ACTIVATION_METADATA_LIMIT
     * 
     * MESSAGE: The floating client has reached it's metadata fields limit.
     */
    public static final int LF_E_FLOATING_CLIENT_METADATA_LIMIT = 54;
    
    /*
     * CODE: LF_E_METER_ATTRIBUTE_NOT_FOUND
     * 
     * MESSAGE: The meter attribute does not exist.
     */
    public static final int LF_E_METER_ATTRIBUTE_NOT_FOUND = 55;
    
    /*
     * CODE: LF_E_METER_ATTRIBUTE_USES_LIMIT_REACHED
     * 
     * MESSAGE: The meter attribute has reached it's usage limit.
     */
    public static final int LF_E_METER_ATTRIBUTE_USES_LIMIT_REACHED = 56;

    /*
     * CODE: LF_E_PRODUCT_VERSION_NOT_LINKED
     * 
     * MESSAGE: No product version is linked with the license.
     */
    public static final int LF_E_PRODUCT_VERSION_NOT_LINKED = 57;

    /*
     * CODE: LF_E_FEATURE_FLAG_NOT_FOUND
     * 
     * MESSAGE: The product version feature flag does not exist.
     */
    public static final int LF_E_FEATURE_FLAG_NOT_FOUND = 58;

    /*
     * CODE: LF_E_SYSTEM_PERMISSION
     * 
     * MESSAGE: Insufficient system permissions.
     */
    public static final int LF_E_SYSTEM_PERMISSION = 59;
    
    /*
     * CODE: LF_E_IP
     * 
     * MESSAGE: IP address is not allowed.
     */
    public static final int LF_E_IP = 60;

    /*
     * CODE: LF_E_INVALID_PERMISSION_FLAG
     * 
     * MESSAGE: Invalid permission flag.
     */
    public static final int LF_E_INVALID_PERMISSION_FLAG = 61;

    /*
     * CODE: LF_E_OFFLINE_FLOATING_LICENSE_NOT_ALLOWED
     * 
     * MESSAGE: Offline floating license is not allowed for per-instance leasing strategy.
     */
    public static final int LF_E_OFFLINE_FLOATING_LICENSE_NOT_ALLOWED = 62;

    /*
     * CODE: LF_E_MAX_OFFLINE_LEASE_DURATION_EXCEEDED
     * 
     * MESSAGE: Maximum offline lease duration exceeded.
     */
    public static final int LF_E_MAX_OFFLINE_LEASE_DURATION_EXCEEDED = 63;

    /*
     * CODE: LF_E_ALLOWED_OFFLINE_FLOATING_CLIENTS_LIMIT_REACHED
     * 
     * MESSAGE: Allowed offline floating clients limit reached.
     */
    public static final int LF_E_ALLOWED_OFFLINE_FLOATING_CLIENTS_LIMIT_REACHED = 64;

    /*
     * CODE: LF_E_WMIC
     * 
     * MESSAGE: Fingerprint couldn't be generated because Windows Management Instrumentation (WMI) service has been disabled.
     */
    public static final int LF_E_WMIC = 65;

    /*
     * CODE: LF_E_MACHINE_FINGERPRINT
     * 
     * MESSAGE: Machine fingerprint has changed since activation.
     */
    public static final int LF_E_MACHINE_FINGERPRINT = 66;

    /*
     * CODE: LF_E_PROXY_NOT_TRUSTED
     *
     * MESSAGE: Request blocked due to untrusted proxy.
     */
    public static final int LF_E_PROXY_NOT_TRUSTED = 67;

    /*
     * CODE: LF_E_ENTITLEMENT_SET_NOT_LINKED
     *
     * MESSAGE: No entitlement set is linked to the license.
     */
    public static final int LF_E_ENTITLEMENT_SET_NOT_LINKED = 68;

    /*
     * CODE: LF_E_FEATURE_ENTITLEMENT_NOT_FOUND
     *
     * MESSAGE: The feature entitlement does not exist.
     */
    public static final int LF_E_FEATURE_ENTITLEMENT_NOT_FOUND = 69;
    
    /*
     * CODE: LF_E_CLIENT
     * 
     * MESSAGE: Client error.
     */
    public static final int LF_E_CLIENT = 70;

    /*
     * CODE: LF_E_SERVER
     * 
     * MESSAGE: Server error.
     */
    public static final int LF_E_SERVER = 71;

    /*
     * CODE: LF_E_SERVER_TIME_MODIFIED
     * 
     * MESSAGE: System time on server has been tampered with. Ensure your date and
     * time settings are correct on the server machine.
     */
    public static final int LF_E_SERVER_TIME_MODIFIED = 72;

    /*
     * CODE: LF_E_SERVER_LICENSE_NOT_ACTIVATED
     * 
     * MESSAGE: The server has not been activated using a license key.
     */
    public static final int LF_E_SERVER_LICENSE_NOT_ACTIVATED = 73;

    /*
     * CODE: LF_E_SERVER_LICENSE_EXPIRED
     * 
     * MESSAGE: The server license has expired.
     */
    public static final int LF_E_SERVER_LICENSE_EXPIRED = 74;

    /*
     * CODE: LF_E_SERVER_LICENSE_SUSPENDED
     * 
     * MESSAGE: The server license has been suspended.
     */
    public static final int LF_E_SERVER_LICENSE_SUSPENDED = 75;

    /*
     * CODE: LF_E_SERVER_LICENSE_GRACE_PERIOD_OVER
     * 
     * MESSAGE: The grace period for server license is over.
     */
    public static final int LF_E_SERVER_LICENSE_GRACE_PERIOD_OVER = 76;
}