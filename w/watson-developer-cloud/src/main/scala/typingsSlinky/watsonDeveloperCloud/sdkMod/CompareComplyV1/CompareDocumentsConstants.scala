package typingsSlinky.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `compareDocuments` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CompareDocumentsConstants")
@js.native
object CompareDocumentsConstants extends js.Object {
  
  /** The content type of file_1. */
  @js.native
  object File1ContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType with String
      ] = js.native
    
    /* "application/json" */ val APPLICATION_JSON: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_JSON with String = js.native
    
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_MSWORD with String = js.native
    
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_PDF with String = js.native
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    /* "image/bmp" */ val IMAGE_BMP: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_BMP with String = js.native
    
    /* "image/gif" */ val IMAGE_GIF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_GIF with String = js.native
    
    /* "image/jpeg" */ val IMAGE_JPEG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_JPEG with String = js.native
    
    /* "image/png" */ val IMAGE_PNG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_PNG with String = js.native
    
    /* "image/tiff" */ val IMAGE_TIFF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_TIFF with String = js.native
  }
  
  /** The content type of file_2. */
  @js.native
  object File2ContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType with String
      ] = js.native
    
    /* "application/json" */ val APPLICATION_JSON: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_JSON with String = js.native
    
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_MSWORD with String = js.native
    
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_PDF with String = js.native
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    /* "image/bmp" */ val IMAGE_BMP: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_BMP with String = js.native
    
    /* "image/gif" */ val IMAGE_GIF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_GIF with String = js.native
    
    /* "image/jpeg" */ val IMAGE_JPEG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_JPEG with String = js.native
    
    /* "image/png" */ val IMAGE_PNG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_PNG with String = js.native
    
    /* "image/tiff" */ val IMAGE_TIFF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_TIFF with String = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model with String
      ] = js.native
    
    /* "contracts" */ val CONTRACTS: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.CONTRACTS with String = js.native
    
    /* "tables" */ val TABLES: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.TABLES with String = js.native
  }
}
