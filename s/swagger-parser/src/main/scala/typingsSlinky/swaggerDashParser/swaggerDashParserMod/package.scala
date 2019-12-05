package typingsSlinky.swaggerDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashParserMod {
  import typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPI.Document

  type $RefsCallback = js.Function2[/* err */ js.Error | Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type ApiCallback = js.Function2[/* err */ js.Error | Null, /* api */ js.UndefOr[Document], js.Any]
}
