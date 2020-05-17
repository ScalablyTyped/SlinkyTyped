package typingsSlinky.simplSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[
typingsSlinky.simplSchema.mod.SchemaDefinition | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.StringConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.DateConstructor | typingsSlinky.std.ArrayConstructor | java.lang.String | typingsSlinky.std.RegExp | typingsSlinky.simplSchema.mod.SimpleSchema]
  - js.Array[js.Any]
*/
trait SimpleSchemaDefinition extends js.Object

object SimpleSchemaDefinition {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): SimpleSchemaDefinition = value.asInstanceOf[SimpleSchemaDefinition]
  @scala.inline
  implicit def apply(
    value: StringDictionary[
      SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | js.RegExp | SimpleSchema
    ]
  ): SimpleSchemaDefinition = value.asInstanceOf[SimpleSchemaDefinition]
}

