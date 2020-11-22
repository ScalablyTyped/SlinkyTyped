package typingsSlinky.typeorm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.typeorm.anon.Synchronize
import typingsSlinky.typeorm.indexOptionsMod.IndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/Index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  
  def Index(): ClassDecorator with PropertyDecorator = js.native
  def Index(fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def Index(fields: js.Array[String], options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def Index(fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]): ClassDecorator with PropertyDecorator = js.native
  def Index(
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]],
    options: IndexOptions
  ): ClassDecorator with PropertyDecorator = js.native
  def Index(name: String): ClassDecorator with PropertyDecorator = js.native
  def Index(name: String, fields: js.Array[String]): ClassDecorator with PropertyDecorator = js.native
  def Index(name: String, fields: js.Array[String], options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def Index(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]]
  ): ClassDecorator with PropertyDecorator = js.native
  def Index(
    name: String,
    fields: js.Function1[/* object */ js.UndefOr[js.Any], js.Array[_] | StringDictionary[Double]],
    options: IndexOptions
  ): ClassDecorator with PropertyDecorator = js.native
  def Index(name: String, options: Synchronize): ClassDecorator with PropertyDecorator = js.native
  def Index(name: String, options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
  def Index(options: IndexOptions): ClassDecorator with PropertyDecorator = js.native
}
