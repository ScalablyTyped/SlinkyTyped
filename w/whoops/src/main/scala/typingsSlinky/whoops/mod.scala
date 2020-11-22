package typingsSlinky.whoops

import typingsSlinky.std.Record
import typingsSlinky.whoops.whoopsStrings.EvalError
import typingsSlinky.whoops.whoopsStrings.RangeError
import typingsSlinky.whoops.whoopsStrings.ReferenceError
import typingsSlinky.whoops.whoopsStrings.SyntaxError
import typingsSlinky.whoops.whoopsStrings.TypeError
import typingsSlinky.whoops.whoopsStrings.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whoops", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): ExtendError[js.Error, _] = js.native
  def apply(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.Error, _] = js.native
  def apply(className: String): ExtendError[js.Error, _] = js.native
  def apply(className: String, props: Record[String, _]): ExtendError[js.Error, _] = js.native
  def apply(className: EvalError): ExtendError[js.EvalError, _] = js.native
  def apply(className: EvalError, props: Record[String, _]): ExtendError[js.EvalError, _] = js.native
  def apply(className: RangeError): ExtendError[js.RangeError, _] = js.native
  def apply(className: RangeError, props: Record[String, _]): ExtendError[js.RangeError, _] = js.native
  def apply(className: ReferenceError): ExtendError[js.ReferenceError, _] = js.native
  def apply(className: ReferenceError, props: Record[String, _]): ExtendError[js.ReferenceError, _] = js.native
  def apply(className: SyntaxError): ExtendError[js.SyntaxError, _] = js.native
  def apply(className: SyntaxError, props: Record[String, _]): ExtendError[js.SyntaxError, _] = js.native
  def apply(className: TypeError): ExtendError[js.TypeError, _] = js.native
  def apply(className: TypeError, props: Record[String, _]): ExtendError[js.TypeError, _] = js.native
  def apply(className: URIError): ExtendError[js.URIError, _] = js.native
  def apply(className: URIError, props: Record[String, _]): ExtendError[js.URIError, _] = js.native
  
  def range(): ExtendError[js.RangeError, _] = js.native
  def range(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.RangeError, _] = js.native
  def range(className: String): ExtendError[js.RangeError, _] = js.native
  def range(className: String, props: Record[String, _]): ExtendError[js.RangeError, _] = js.native
  
  def reference(): ExtendError[js.ReferenceError, _] = js.native
  def reference(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.ReferenceError, _] = js.native
  def reference(className: String): ExtendError[js.ReferenceError, _] = js.native
  def reference(className: String, props: Record[String, _]): ExtendError[js.ReferenceError, _] = js.native
  
  // function eval(className?: string, props?: Record<string, any>): ExtendError<EvalError>;
  def syntax(): ExtendError[js.SyntaxError, _] = js.native
  def syntax(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.SyntaxError, _] = js.native
  def syntax(className: String): ExtendError[js.SyntaxError, _] = js.native
  def syntax(className: String, props: Record[String, _]): ExtendError[js.SyntaxError, _] = js.native
  
  def `type`(): ExtendError[js.TypeError, _] = js.native
  def `type`(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.TypeError, _] = js.native
  def `type`(className: String): ExtendError[js.TypeError, _] = js.native
  def `type`(className: String, props: Record[String, _]): ExtendError[js.TypeError, _] = js.native
  
  def uri(): ExtendError[js.URIError, _] = js.native
  def uri(className: js.UndefOr[scala.Nothing], props: Record[String, _]): ExtendError[js.URIError, _] = js.native
  def uri(className: String): ExtendError[js.URIError, _] = js.native
  def uri(className: String, props: Record[String, _]): ExtendError[js.URIError, _] = js.native
  
  type ExtendError[E /* <: js.Error */, P /* <: Record[String, _] */] = js.Function1[/* propsOrMessage */ js.UndefOr[P | String], E with P]
}
