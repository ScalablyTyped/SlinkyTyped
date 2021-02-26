package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `convertToHtml` operation. */
object ConvertToHtmlConstants {
  
  @js.native
  sealed trait FileContentType extends StObject
  /** The content type of file. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "ConvertToHtmlConstants.FileContentType")
  @js.native
  object FileContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_PDF with String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    @js.native
    sealed trait IMAGE_BMP extends FileContentType
    /* "image/bmp" */ val IMAGE_BMP: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_BMP with String = js.native
    
    @js.native
    sealed trait IMAGE_GIF extends FileContentType
    /* "image/gif" */ val IMAGE_GIF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_GIF with String = js.native
    
    @js.native
    sealed trait IMAGE_JPEG extends FileContentType
    /* "image/jpeg" */ val IMAGE_JPEG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_JPEG with String = js.native
    
    @js.native
    sealed trait IMAGE_PNG extends FileContentType
    /* "image/png" */ val IMAGE_PNG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_PNG with String = js.native
    
    @js.native
    sealed trait IMAGE_TIFF extends FileContentType
    /* "image/tiff" */ val IMAGE_TIFF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.IMAGE_TIFF with String = js.native
    
    @js.native
    sealed trait TEXT_PLAIN extends FileContentType
    /* "text/plain" */ val TEXT_PLAIN: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.FileContentType.TEXT_PLAIN with String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "ConvertToHtmlConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    
    @js.native
    sealed trait CONTRACTS extends Model
    /* "contracts" */ val CONTRACTS: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model.CONTRACTS with String = js.native
    
    @js.native
    sealed trait TABLES extends Model
    /* "tables" */ val TABLES: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ConvertToHtmlConstants.Model.TABLES with String = js.native
  }
}
