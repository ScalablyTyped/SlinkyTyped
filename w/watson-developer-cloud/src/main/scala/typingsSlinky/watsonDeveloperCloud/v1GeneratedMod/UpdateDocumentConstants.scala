package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateDocument` operation. */
object UpdateDocumentConstants {
  
  @js.native
  sealed trait FileContentType extends StObject
  /** The content type of file. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateDocumentConstants.FileContentType")
  @js.native
  object FileContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends FileContentType
    /* "application/json" */ val APPLICATION_JSON: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_PDF with String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    @js.native
    sealed trait APPLICATION_XHTML_XML extends FileContentType
    /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_XHTML_XML with String = js.native
    
    @js.native
    sealed trait TEXT_HTML extends FileContentType
    /* "text/html" */ val TEXT_HTML: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.UpdateDocumentConstants.FileContentType.TEXT_HTML with String = js.native
  }
}
