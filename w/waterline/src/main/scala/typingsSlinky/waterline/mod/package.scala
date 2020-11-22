package typingsSlinky.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Adapter = js.Object
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.waterline.mod.StringAttribute
    - typingsSlinky.waterline.mod.EmailAttribute
    - typingsSlinky.waterline.mod.IntegerAttribute
    - typingsSlinky.waterline.mod.NumberAttribute
    - typingsSlinky.waterline.mod.FloatAttribute
    - typingsSlinky.waterline.mod.DateAttribute
    - typingsSlinky.waterline.mod.TimeAttribute
    - typingsSlinky.waterline.mod.DatetimeAttribute
    - typingsSlinky.waterline.mod.BooleanAttribute
    - typingsSlinky.waterline.mod.BinaryAttribute
    - typingsSlinky.waterline.mod.ArrayAttribute
    - typingsSlinky.waterline.mod.JsonAttribute
    - typingsSlinky.waterline.mod.OneToOneAttribute
    - typingsSlinky.waterline.mod.OneToManyAttribute
    - typingsSlinky.waterline.mod.ManyToManyAttribute
    - typingsSlinky.waterline.mod.FunctionAttribute
  */
  type Attribute = typingsSlinky.waterline.mod._Attribute | java.lang.String | typingsSlinky.waterline.mod.FunctionAttribute
  
  type AttributeValidation[T] = T | typingsSlinky.waterline.mod.AttributeValidationSyncFn[T] | typingsSlinky.waterline.mod.AttributeValidationAsyncFn[T]
  
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]
  
  type AttributeValidationSyncFn[T] = js.Function0[T]
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  
  type CollectionClass = js.Function0[typingsSlinky.waterline.mod.Collection]
  
  type DefaultsToFn[T] = js.Function0[T]
  
  type FunctionAttribute = js.Function0[js.Any]
}
