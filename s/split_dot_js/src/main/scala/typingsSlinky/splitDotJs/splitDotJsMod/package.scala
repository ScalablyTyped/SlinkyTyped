package typingsSlinky.splitDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splitDotJsMod {
  import org.scalajs.dom.raw.CSSStyleDeclaration

  type CSSStyleDeclarationPartial = Partial[CSSStyleDeclaration]
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.splitDotJs.splitDotJsStrings.Partial with T
}
