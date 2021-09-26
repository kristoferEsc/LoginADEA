package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="usuariosADEA")
public class UsuarioADEA implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@Column(name = "loginUsuario", length = 20, nullable = false)
	private String loginUsuario;
	@Column(name = "passUsuario", length = 200, nullable = false)
	private String passUsuario;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "cliente", nullable = false)
    private float cliente;
    @Column(name = "email", length = 50, nullable = true)
    private String email;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaalta")
    private Date fechaalta;
    @Column(name = "fechabaja", nullable = true)
    private Date fechabaja;
    @Column(name = "estatus")
    @ColumnDefault("'A'")
    private char estatus;
    @Column(name = "intentos")
    @ColumnDefault("0")
    private float intentos;
    @Column(name = "fecharevocado", nullable = true)
    private Date fecharevocado;
    @Column(name = "fecha_vigencia", nullable = true)
    private Date fecha_vigencia;
    @Column(name = "no_acceso", nullable = true)
    private int no_acceso;
    @Column(name = "apellido_paterno", nullable = true, length = 50)
    private String apellido_paterno;
    @Column(name = "apellido_materno", nullable = true, length = 50)
    private String apellido_materno;
    @Column(name = "area", nullable = true, length = 4)
    private int area;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechamodificacion")
    private Date fechamodificacion;
	
       
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getPassUsuario() {
		return passUsuario;
	}
	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCliente() {
		return cliente;
	}
	public void setCliente(float cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaalta() {
		return fechaalta;
	}
	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}
	public Date getFechabaja() {
		return fechabaja;
	}
	public void setFechabaja(Date fechabaja) {
		this.fechabaja = fechabaja;
	}
	public char getEstatus() {
		return estatus;
	}
	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	public float getIntentos() {
		return intentos;
	}
	public void setIntentos(float intentos) {
		this.intentos = intentos;
	}
	public Date getFecharevocado() {
		return fecharevocado;
	}
	public void setFecharevocado(Date fecharevocado) {
		this.fecharevocado = fecharevocado;
	}
	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}
	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}
	public int getNo_acceso() {
		return no_acceso;
	}
	public void setNo_acceso(int no_acceso) {
		this.no_acceso = no_acceso;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Date getFechamodificacion() {
		return fechamodificacion;
	}
	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}
	public UsuarioADEA(Long idUsuario, String loginUsuario, String passUsuario, String nombre, float cliente,
			String email, Date fechaalta, Date fechabaja, char estatus, float intentos, Date fecharevocado,
			Date fecha_vigencia, int no_acceso, String apellido_paterno, String apellido_materno, int area,
			Date fechamodificacion) {
		super();
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.passUsuario = passUsuario;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.fechaalta = fechaalta;
		this.fechabaja = fechabaja;
		this.estatus = estatus;
		this.intentos = intentos;
		this.fecharevocado = fecharevocado;
		this.fecha_vigencia = fecha_vigencia;
		this.no_acceso = no_acceso;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.area = area;
		this.fechamodificacion = fechamodificacion;
	}

	public UsuarioADEA() {
		super();
	}
    

}
