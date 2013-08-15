package com.danielme.tips.struts2.actions;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author danielme.com
 *
 */
public class SubidaFicheroAction extends ActionSupport 
{	

	private static final long serialVersionUID = 1L;
	
	private List<File> uploadFichero = new LinkedList<File>();
	private List<String> uploadFicheroFileName = new LinkedList<String>();
	private List<String> uploadFicheroContentType = new LinkedList<String>();	
	
	/** ACCIONES **/
	
	public String inicio() 
	{
        return INPUT;
    }
	
	public String enviar()
	{
		if (uploadFichero.isEmpty())
		{
			return INPUT;
		}
		else
		{
			return SUCCESS;
		}
	}

	/** GETTERS Y SETTERS **/
	
	public List<File> getUploadFichero()
	{
		return uploadFichero;
	}

	public void setUploadFichero(List<File> uploadFichero)
	{
		this.uploadFichero = uploadFichero;
	}

	public List<String> getUploadFicheroFileName()
	{
		return uploadFicheroFileName;
	}

	public void setUploadFicheroFileName(List<String> uploadFicheroFileName)
	{
		this.uploadFicheroFileName = uploadFicheroFileName;
	}

	public List<String> getUploadFicheroContentType()
	{
		return uploadFicheroContentType;
	}

	public void setUploadFicheroContentType(List<String> uploadFicheroContentType)
	{
		this.uploadFicheroContentType = uploadFicheroContentType;
	}
    

}