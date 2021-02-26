package typingsSlinky.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjFile used for accessing and manipulating files in the file cabinet.
  *
  * @classDescription Encapsulation of files (media items) in the file cabinet.
  * @return {nlobjFile}
  * @constructor
  *
  * @since 2009.1
  */
@js.native
trait nlobjFile
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * return the file description.
    * @return {string}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getDescription(): String = js.native
  
  /**
    * return the internal ID of the folder that this file is in.
    * @return {int}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getFolder(): js.Any = js.native
  
  /**
    * Return the id of the file (if stored in the FC).
    * @return {int}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getId(): js.Any = js.native
  
  /**
    * Return the name of the file.
    * @return {string}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getName(): String = js.native
  
  /**
    * Return the size of the file in bytes.
    * @return {int}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getSize(): js.Any = js.native
  
  /**
    * Return the type of the file.
    * @return {string}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getType(): String = js.native
  
  /**
    * Return the URL of the file (if stored in the FC).
    * @return {string}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getURL(): String = js.native
  
  /**
    * Return the value (base64 encoded for binary types) of the file.
    * @return {string}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def getValue(): String = js.native
  
  /**
    * return true if the file is inactive.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def isInactive(): Boolean = js.native
  
  /**
    * return true if the file is "Available without Login".
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @return
    */
  def isOnline(): Boolean = js.native
  
  /**
    * sets the file's description.
    * @param {string} descr the file description
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @param descr
    * @return
    */
  def setDescription(descr: String): js.Any = js.native
  
  /**
    * sets the character encoding for the file.
    * @param {String} encoding
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2010.2
    * @param encoding
    * @return
    */
  def setEncoding(encoding: String): js.Any = js.native
  
  /**
    * sets the internal ID of the folder that this file is in.
    * @param {int} folder
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @param folder
    * @return
    */
  def setFolder(folder: js.Any): js.Any = js.native
  
  /**
    * sets the file's inactive status.
    * @param {boolean} inactive
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @param inactive
    * @return
    */
  def setIsInactive(inactive: Boolean): js.Any = js.native
  
  /**
    * sets the file's "Available without Login" status.
    * @param {boolean} online
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @param online
    * @return
    */
  def setIsOnline(online: Boolean): js.Any = js.native
  
  /**
    * Sets the name of a file.
    * @param {string} name the name of the file
    * @return {void}
    *
    * @method
    * @memberOf nlobjFile
    *
    * @since 2009.1
    * @param name
    * @return
    */
  def setName(name: String): js.Any = js.native
}
