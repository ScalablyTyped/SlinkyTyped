package typingsSlinky.swaggerDashSchemaDashOfficial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashSchemaDashOfficialMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.swaggerDashSchemaDashOfficial.Anon_AllowEmptyValue
  import typingsSlinky.swaggerDashSchemaDashOfficial.Anon_AllowEmptyValueCollectionFormat
  import typingsSlinky.swaggerDashSchemaDashOfficial.Anon_Body
  import typingsSlinky.swaggerDashSchemaDashOfficial.Anon_Header
  import typingsSlinky.swaggerDashSchemaDashOfficial.Anon_In

  type BaseFormatContrainedParameter = BaseParameter with SchemaFormatConstraints
  type BodyParameter = BaseParameter with Anon_Body
  type FormDataParameter = BaseFormatContrainedParameter with BaseSchema with Anon_AllowEmptyValueCollectionFormat
  type HeaderParameter = BaseFormatContrainedParameter with BaseSchema with Anon_Header
  type OAuthScope = StringDictionary[String]
  type Parameter = BodyParameter | FormDataParameter | QueryParameter | PathParameter | HeaderParameter
  type PathParameter = BaseFormatContrainedParameter with BaseSchema with Anon_In
  type QueryParameter = BaseFormatContrainedParameter with BaseSchema with Anon_AllowEmptyValue
}
