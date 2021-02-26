package typingsSlinky.stripe.mod.resources

import typingsSlinky.std.Extract
import typingsSlinky.stripe.anon.TypeT
import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethod
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodAttachOptions
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodCreationOptions
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodListOptions
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodType
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** https://stripe.com/docs/api/payment_methods */
@JSImport("stripe", "resources.PaymentMethods")
@js.native
class PaymentMethods () extends StObject {
  
  def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions): js.Promise[IPaymentMethod] = js.native
  def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
  def attach(
    paymentMethodId: String,
    data: IPaymentMethodAttachOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentMethod]
  ): js.Promise[IPaymentMethod] = js.native
  def attach(paymentMethodId: String, data: IPaymentMethodAttachOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  
  def create(data: IPaymentMethodCreationOptions): js.Promise[IPaymentMethod] = js.native
  def create(data: IPaymentMethodCreationOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
  def create(data: IPaymentMethodCreationOptions, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  def create(data: IPaymentMethodCreationOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  
  def detach(paymentMethodId: String): js.Promise[IPaymentMethod] = js.native
  def detach(paymentMethodId: String, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
  def detach(paymentMethodId: String, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  def detach(paymentMethodId: String, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T]): IListPromise[Extract[IPaymentMethod, TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], options: HeaderOptions): IListPromise[Extract[IPaymentMethod, TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](
    data: IPaymentMethodListOptions[T],
    options: HeaderOptions,
    response: IResponseFn[IList[IPaymentMethod]]
  ): IListPromise[Extract[IPaymentMethod, TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], response: IResponseFn[IList[IPaymentMethod]]): IListPromise[Extract[IPaymentMethod, TypeT[T]]] = js.native
  
  def retrieve(paymentMethodId: String): js.Promise[IPaymentMethod] = js.native
  def retrieve(paymentMethodId: String, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
  def retrieve(paymentMethodId: String, options: HeaderOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  def retrieve(paymentMethodId: String, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
  
  def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions): js.Promise[IPaymentMethod] = js.native
  def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions, options: HeaderOptions): js.Promise[IPaymentMethod] = js.native
  def update(
    paymentMethodId: String,
    data: IPaymentMethodUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentMethod]
  ): js.Promise[IPaymentMethod] = js.native
  def update(paymentMethodId: String, data: IPaymentMethodUpdateOptions, response: IResponseFn[IPaymentMethod]): js.Promise[IPaymentMethod] = js.native
}
