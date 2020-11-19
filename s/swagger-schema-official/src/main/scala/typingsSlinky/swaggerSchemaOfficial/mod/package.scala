package typingsSlinky.swaggerSchemaOfficial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BaseFormatContrainedParameter = typingsSlinky.swaggerSchemaOfficial.mod.BaseParameter with typingsSlinky.swaggerSchemaOfficial.mod.SchemaFormatConstraints
  
  type FormDataParameter = typingsSlinky.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsSlinky.swaggerSchemaOfficial.mod.BaseSchema with typingsSlinky.swaggerSchemaOfficial.anon.CollectionFormat
  
  type HeaderParameter = typingsSlinky.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsSlinky.swaggerSchemaOfficial.mod.BaseSchema with typingsSlinky.swaggerSchemaOfficial.anon.`0`
  
  type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Parameter = typingsSlinky.swaggerSchemaOfficial.mod.BodyParameter | typingsSlinky.swaggerSchemaOfficial.mod.FormDataParameter | typingsSlinky.swaggerSchemaOfficial.mod.QueryParameter | typingsSlinky.swaggerSchemaOfficial.mod.PathParameter | typingsSlinky.swaggerSchemaOfficial.mod.HeaderParameter
  
  type PathParameter = typingsSlinky.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsSlinky.swaggerSchemaOfficial.mod.BaseSchema with typingsSlinky.swaggerSchemaOfficial.anon.In
  
  type QueryParameter = typingsSlinky.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsSlinky.swaggerSchemaOfficial.mod.BaseSchema with typingsSlinky.swaggerSchemaOfficial.anon.AllowEmptyValue
}
