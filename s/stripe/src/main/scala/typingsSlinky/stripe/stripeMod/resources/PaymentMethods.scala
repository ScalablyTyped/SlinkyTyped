package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.std.Extract
import typingsSlinky.stripe.Anon_TypeT
import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IList
import typingsSlinky.stripe.stripeMod.IListPromise
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethod
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethodAttachOptions
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethodCreationOptions
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethodListOptions
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethodType
import typingsSlinky.stripe.stripeMod.paymentMethods.IPaymentMethodUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://stripe.com/docs/api/payment_methods */
@JSImport("stripe", "resources.PaymentMethods")
@js.native
class PaymentMethods () extends js.Object {
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
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T]): IListPromise[Extract[IPaymentMethod, Anon_TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], options: HeaderOptions): IListPromise[Extract[IPaymentMethod, Anon_TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](
    data: IPaymentMethodListOptions[T],
    options: HeaderOptions,
    response: IResponseFn[IList[IPaymentMethod]]
  ): IListPromise[Extract[IPaymentMethod, Anon_TypeT[T]]] = js.native
  def list[T /* <: IPaymentMethodType */](data: IPaymentMethodListOptions[T], response: IResponseFn[IList[IPaymentMethod]]): IListPromise[Extract[IPaymentMethod, Anon_TypeT[T]]] = js.native
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

