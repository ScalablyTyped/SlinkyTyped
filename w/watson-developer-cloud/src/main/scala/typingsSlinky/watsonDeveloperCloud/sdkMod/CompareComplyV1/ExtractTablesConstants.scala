package typingsSlinky.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `extractTables` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ExtractTablesConstants")
@js.native
object ExtractTablesConstants extends js.Object {
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_PDF with String = js.native
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    /* "image/bmp" */ val IMAGE_BMP: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_BMP with String = js.native
    /* "image/gif" */ val IMAGE_GIF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_GIF with String = js.native
    /* "image/jpeg" */ val IMAGE_JPEG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_JPEG with String = js.native
    /* "image/png" */ val IMAGE_PNG: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_PNG with String = js.native
    /* "image/tiff" */ val IMAGE_TIFF: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.IMAGE_TIFF with String = js.native
    /* "text/plain" */ val TEXT_PLAIN: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType.TEXT_PLAIN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.FileContentType with String
      ] = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    /* "contracts" */ val CONTRACTS: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.ExtractTablesConstants.Model with String
      ] = js.native
  }
  
}

