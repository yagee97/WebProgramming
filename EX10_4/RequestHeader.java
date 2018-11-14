package myPackage;

public class RequestHeader {
    private String host, connection, accept, acceptEncoding,
    acceptLanguage,cacheControl,userAgent,cookie;

	public String getHost() {
		return host;
	}

	public String getConnection() {
		return connection;
	}

	public String getAccept() {
		return accept;
	}

	public String getAcceptEncoding() {
		return acceptEncoding;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public String getCacheControl() {
		return cacheControl;
	}

	public String getUserAgent() {
		return userAgent;
	}
	
	public String getCookie(){
		return cookie;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public void setCacheControl(String cacheControl) {
		this.cacheControl = cacheControl;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	
	public void setCookie(String cookie){
		this.cookie = cookie;
	}
	
	
    
    

    
}
