package typingsSlinky.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object waterlineMod {
  import typingsSlinky.waterline.Anon_Alter
  import typingsSlinky.waterline.Anon_Array
  import typingsSlinky.waterline.Anon_Association
  import typingsSlinky.waterline.Anon_AutoIncrement
  import typingsSlinky.waterline.Anon_Binary
  import typingsSlinky.waterline.Anon_Boolean
  import typingsSlinky.waterline.Anon_Cb
  import typingsSlinky.waterline.Anon_Collection
  import typingsSlinky.waterline.Anon_CollectionDominant
  import typingsSlinky.waterline.Anon_ColumnName
  import typingsSlinky.waterline.Anon_Date
  import typingsSlinky.waterline.Anon_Datetime
  import typingsSlinky.waterline.Anon_Email
  import typingsSlinky.waterline.Anon_Float
  import typingsSlinky.waterline.Anon_Json
  import typingsSlinky.waterline.Anon_Model
  import typingsSlinky.waterline.Anon_String
  import typingsSlinky.waterline.Anon_Text
  import typingsSlinky.waterline.Anon_Time

  type Adapter = js.Object
  type ArrayAttribute = BaseAttribute[_] with Anon_Array
  type Attribute = String | StringAttribute | EmailAttribute | IntegerAttribute | FloatAttribute | DateAttribute | TimeAttribute | DatetimeAttribute | BooleanAttribute | BinaryAttribute | ArrayAttribute | JsonAttribute | OneToOneAttribute | OneToManyAttribute | ManyToManyAttribute | FunctionAttribute
  type AttributeValidation[T] = T | AttributeValidationSyncFn[T] | AttributeValidationAsyncFn[T]
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type BaseAttribute[T] = AttributeValidations with Anon_ColumnName[T]
  type BinaryAttribute = BaseAttribute[_] with Anon_Binary
  type BooleanAttribute = BaseAttribute[Boolean] with Anon_Boolean
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type Collection = CollectionDefinition
  type CollectionClass = js.Function0[Collection]
  type CollectionDefinition = LifecycleCallbacks with Anon_Alter
  type DateAttribute = BaseAttribute[js.Date] with Anon_Date
  type DatetimeAttribute = BaseAttribute[js.Date] with Anon_Datetime
  type DefaultsToFn[T] = js.Function0[T]
  type EmailAttribute = BaseAttribute[String] with Anon_Email
  type FloatAttribute = BaseAttribute[Double] with Anon_Float
  type FunctionAttribute = js.Function0[js.Any]
  type IntegerAttribute = BaseAttribute[Double] with Anon_AutoIncrement
  type JsonAttribute = BaseAttribute[_] with Anon_Json
  type ManyToManyAttribute = BaseAttribute[_] with Anon_CollectionDominant
  type OneToManyAttribute = BaseAttribute[_] with Anon_Collection
  type OneToOneAttribute = BaseAttribute[_] with Anon_Model
  type QueryBuilder[T] = WaterlinePromise[T] with Anon_Association
  type StringAttribute = BaseAttribute[String] with Anon_String
  type TextAttribute = BaseAttribute[String] with Anon_Text
  type TimeAttribute = BaseAttribute[js.Date] with Anon_Time
  type WaterlinePromise[T] = typingsSlinky.bluebird.bluebirdMod.^[T] with Anon_Cb[T]
}
