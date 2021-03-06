/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package nl.fmc.configuration;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Collections;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Component.
 * 
 * @version $Revision$ $Date$
 */
public class Component implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _changeList
     */
    private java.util.ArrayList _changeList;

    /**
     * Field _version
     */
    private java.lang.String _version;

    /**
     * Field _configstrings
     */
    private nl.fmc.configuration.Configstrings _configstrings;

    /**
     * Field _configcursors
     */
    private nl.fmc.configuration.Configcursors _configcursors;

    /**
     * Field _configstyles
     */
    private nl.fmc.configuration.Configstyles _configstyles;

    /**
     * Field _fileList
     */
    private java.util.ArrayList _fileList;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _configtags
     */
    private nl.fmc.configuration.Configtags _configtags;

    /**
     * Field _methods
     */
    private nl.fmc.configuration.Methods _methods;

    /**
     * Field _events
     */
    private nl.fmc.configuration.Events _events;


      //----------------/
     //- Constructors -/
    //----------------/

    public Component() 
     {
        super();
        _changeList = new java.util.ArrayList();
        _fileList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Component()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addChange
     * 
     * 
     * 
     * @param vChange
     */
    public void addChange(java.lang.String vChange)
        throws java.lang.IndexOutOfBoundsException
    {
        _changeList.add(vChange);
    } //-- void addChange(java.lang.String) 

    /**
     * Method addChange
     * 
     * 
     * 
     * @param index
     * @param vChange
     */
    public void addChange(int index, java.lang.String vChange)
        throws java.lang.IndexOutOfBoundsException
    {
        _changeList.add(index, vChange);
    } //-- void addChange(int, java.lang.String) 

    /**
     * Method addFile
     * 
     * 
     * 
     * @param vFile
     */
    public void addFile(java.lang.String vFile)
        throws java.lang.IndexOutOfBoundsException
    {
        _fileList.add(vFile);
    } //-- void addFile(java.lang.String) 

    /**
     * Method addFile
     * 
     * 
     * 
     * @param index
     * @param vFile
     */
    public void addFile(int index, java.lang.String vFile)
        throws java.lang.IndexOutOfBoundsException
    {
        _fileList.add(index, vFile);
    } //-- void addFile(int, java.lang.String) 

    /**
     * Method clearChange
     * 
     */
    public void clearChange()
    {
        _changeList.clear();
    } //-- void clearChange() 

    /**
     * Method clearFile
     * 
     */
    public void clearFile()
    {
        _fileList.clear();
    } //-- void clearFile() 

    /**
     * Method enumerateChange
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateChange()
    {
        return Collections.enumeration(_changeList);
    } //-- java.util.Enumeration enumerateChange() 

    /**
     * Method enumerateFile
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateFile()
    {
        return Collections.enumeration(_fileList);
    } //-- java.util.Enumeration enumerateFile() 

    /**
     * Method getChange
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getChange(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _changeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_changeList.get(index);
    } //-- java.lang.String getChange(int) 

    /**
     * Method getChange
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getChange()
    {
        int size = _changeList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_changeList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getChange() 

    /**
     * Method getChangeCount
     * 
     * 
     * 
     * @return int
     */
    public int getChangeCount()
    {
        return _changeList.size();
    } //-- int getChangeCount() 

    /**
     * Returns the value of field 'configcursors'.
     * 
     * @return Configcursors
     * @return the value of field 'configcursors'.
     */
    public nl.fmc.configuration.Configcursors getConfigcursors()
    {
        return this._configcursors;
    } //-- nl.fmc.configuration.Configcursors getConfigcursors() 

    /**
     * Returns the value of field 'configstrings'.
     * 
     * @return Configstrings
     * @return the value of field 'configstrings'.
     */
    public nl.fmc.configuration.Configstrings getConfigstrings()
    {
        return this._configstrings;
    } //-- nl.fmc.configuration.Configstrings getConfigstrings() 

    /**
     * Returns the value of field 'configstyles'.
     * 
     * @return Configstyles
     * @return the value of field 'configstyles'.
     */
    public nl.fmc.configuration.Configstyles getConfigstyles()
    {
        return this._configstyles;
    } //-- nl.fmc.configuration.Configstyles getConfigstyles() 

    /**
     * Returns the value of field 'configtags'.
     * 
     * @return Configtags
     * @return the value of field 'configtags'.
     */
    public nl.fmc.configuration.Configtags getConfigtags()
    {
        return this._configtags;
    } //-- nl.fmc.configuration.Configtags getConfigtags() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return String
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'events'.
     * 
     * @return Events
     * @return the value of field 'events'.
     */
    public nl.fmc.configuration.Events getEvents()
    {
        return this._events;
    } //-- nl.fmc.configuration.Events getEvents() 

    /**
     * Method getFile
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getFile(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _fileList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_fileList.get(index);
    } //-- java.lang.String getFile(int) 

    /**
     * Method getFile
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getFile()
    {
        int size = _fileList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_fileList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getFile() 

    /**
     * Method getFileCount
     * 
     * 
     * 
     * @return int
     */
    public int getFileCount()
    {
        return _fileList.size();
    } //-- int getFileCount() 

    /**
     * Returns the value of field 'methods'.
     * 
     * @return Methods
     * @return the value of field 'methods'.
     */
    public nl.fmc.configuration.Methods getMethods()
    {
        return this._methods;
    } //-- nl.fmc.configuration.Methods getMethods() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'version'.
     * 
     * @return String
     * @return the value of field 'version'.
     */
    public java.lang.String getVersion()
    {
        return this._version;
    } //-- java.lang.String getVersion() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeChange
     * 
     * 
     * 
     * @param vChange
     * @return boolean
     */
    public boolean removeChange(java.lang.String vChange)
    {
        boolean removed = _changeList.remove(vChange);
        return removed;
    } //-- boolean removeChange(java.lang.String) 

    /**
     * Method removeFile
     * 
     * 
     * 
     * @param vFile
     * @return boolean
     */
    public boolean removeFile(java.lang.String vFile)
    {
        boolean removed = _fileList.remove(vFile);
        return removed;
    } //-- boolean removeFile(java.lang.String) 

    /**
     * Method setChange
     * 
     * 
     * 
     * @param index
     * @param vChange
     */
    public void setChange(int index, java.lang.String vChange)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _changeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _changeList.set(index, vChange);
    } //-- void setChange(int, java.lang.String) 

    /**
     * Method setChange
     * 
     * 
     * 
     * @param changeArray
     */
    public void setChange(java.lang.String[] changeArray)
    {
        //-- copy array
        _changeList.clear();
        for (int i = 0; i < changeArray.length; i++) {
            _changeList.add(changeArray[i]);
        }
    } //-- void setChange(java.lang.String) 

    /**
     * Sets the value of field 'configcursors'.
     * 
     * @param configcursors the value of field 'configcursors'.
     */
    public void setConfigcursors(nl.fmc.configuration.Configcursors configcursors)
    {
        this._configcursors = configcursors;
    } //-- void setConfigcursors(nl.fmc.configuration.Configcursors) 

    /**
     * Sets the value of field 'configstrings'.
     * 
     * @param configstrings the value of field 'configstrings'.
     */
    public void setConfigstrings(nl.fmc.configuration.Configstrings configstrings)
    {
        this._configstrings = configstrings;
    } //-- void setConfigstrings(nl.fmc.configuration.Configstrings) 

    /**
     * Sets the value of field 'configstyles'.
     * 
     * @param configstyles the value of field 'configstyles'.
     */
    public void setConfigstyles(nl.fmc.configuration.Configstyles configstyles)
    {
        this._configstyles = configstyles;
    } //-- void setConfigstyles(nl.fmc.configuration.Configstyles) 

    /**
     * Sets the value of field 'configtags'.
     * 
     * @param configtags the value of field 'configtags'.
     */
    public void setConfigtags(nl.fmc.configuration.Configtags configtags)
    {
        this._configtags = configtags;
    } //-- void setConfigtags(nl.fmc.configuration.Configtags) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'events'.
     * 
     * @param events the value of field 'events'.
     */
    public void setEvents(nl.fmc.configuration.Events events)
    {
        this._events = events;
    } //-- void setEvents(nl.fmc.configuration.Events) 

    /**
     * Method setFile
     * 
     * 
     * 
     * @param index
     * @param vFile
     */
    public void setFile(int index, java.lang.String vFile)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _fileList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _fileList.set(index, vFile);
    } //-- void setFile(int, java.lang.String) 

    /**
     * Method setFile
     * 
     * 
     * 
     * @param fileArray
     */
    public void setFile(java.lang.String[] fileArray)
    {
        //-- copy array
        _fileList.clear();
        for (int i = 0; i < fileArray.length; i++) {
            _fileList.add(fileArray[i]);
        }
    } //-- void setFile(java.lang.String) 

    /**
     * Sets the value of field 'methods'.
     * 
     * @param methods the value of field 'methods'.
     */
    public void setMethods(nl.fmc.configuration.Methods methods)
    {
        this._methods = methods;
    } //-- void setMethods(nl.fmc.configuration.Methods) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(java.lang.String version)
    {
        this._version = version;
    } //-- void setVersion(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Component
     */
    public static nl.fmc.configuration.Component unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Component) Unmarshaller.unmarshal(nl.fmc.configuration.Component.class, reader);
    } //-- nl.fmc.configuration.Component unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
