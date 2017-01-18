package br.e3.util;

public final class ServicePath {

	///////////////////////////////////////////////////////////////
	// ROOT PATH
	///////////////////////////////////////////////////////////////

	public static final String ALL = "/**";

	public static final String ROOT_PATH = "/api";

	public static final String PUBLIC_ROOT_PATH = ROOT_PATH + "/public";

	public static final String PRIVATE_ROOT_PATH = ROOT_PATH + "/private";

	///////////////////////////////////////////////////////////////
	// PRIVATE PATHS
	///////////////////////////////////////////////////////////////

	public static final String USUARIO_PATH = PRIVATE_ROOT_PATH + "/usuario";

	public static final String PERMISSAO_PATH = PRIVATE_ROOT_PATH + "/permissao";
	
	public static final String MESADA_PATH = PRIVATE_ROOT_PATH + "/mesada";
	
	public static final String MODIFICADOR_PATH = PRIVATE_ROOT_PATH + "/modificador";

	///////////////////////////////////////////////////////////////
	// PUBLIC PATHS
	///////////////////////////////////////////////////////////////

	public static final String LOGIN_PATH = PUBLIC_ROOT_PATH + "/login";

	public static final String LOGOUT_PATH = PUBLIC_ROOT_PATH + "/logout";

}