package typingsSlinky.watsonDashDeveloperDashCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `classifyElements` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.ClassifyElementsConstants")
@js.native
object ClassifyElementsConstants extends js.Object {
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_PDF with String = js.native
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    /* "image/bmp" */ val IMAGE_BMP: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_BMP with String = js.native
    /* "image/gif" */ val IMAGE_GIF: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_GIF with String = js.native
    /* "image/jpeg" */ val IMAGE_JPEG: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_JPEG with String = js.native
    /* "image/png" */ val IMAGE_PNG: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_PNG with String = js.native
    /* "image/tiff" */ val IMAGE_TIFF: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_TIFF with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.FileContentType with String
      ] = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    /* "contracts" */ val CONTRACTS: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.ClassifyElementsConstants.Model with String
      ] = js.native
  }
  
}

