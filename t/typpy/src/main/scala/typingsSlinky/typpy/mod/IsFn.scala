package typingsSlinky.typpy.mod

import typingsSlinky.typpy.typpyStrings.`null`
import typingsSlinky.typpy.typpyStrings.array
import typingsSlinky.typpy.typpyStrings.boolean
import typingsSlinky.typpy.typpyStrings.function
import typingsSlinky.typpy.typpyStrings.nan
import typingsSlinky.typpy.typpyStrings.number
import typingsSlinky.typpy.typpyStrings.regexp
import typingsSlinky.typpy.typpyStrings.string
import typingsSlinky.typpy.typpyStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFn extends js.Object {
  
  def apply(input: js.UndefOr[scala.Nothing]): undefined = js.native
  def apply(input: String): string = js.native
  def apply(input: js.Any): String = js.native
  def apply(input: js.Array[_]): array = js.native
  def apply(input: js.Function): function = js.native
  def apply(input: Boolean): boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double): number | nan = js.native
  def apply(input: Null): `null` = js.native
  def apply(input: js.RegExp): regexp = js.native
}
