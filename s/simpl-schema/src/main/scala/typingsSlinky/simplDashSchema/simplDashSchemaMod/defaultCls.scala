package typingsSlinky.simplDashSchema.simplDashSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simpl-schema", JSImport.Default)
@js.native
class defaultCls protected () extends SimpleSchema {
  def this(schema: js.Array[_]) = this()
  def this(schema: StringDictionary[
        SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | js.RegExp | SimpleSchema
      ]) = this()
  def this(schema: js.Array[_], options: SimpleSchemaOptions) = this()
  def this(
    schema: StringDictionary[
        SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | js.RegExp | SimpleSchema
      ],
    options: SimpleSchemaOptions
  ) = this()
}

