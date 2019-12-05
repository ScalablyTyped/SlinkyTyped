package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IDataOptions
import typingsSlinky.stripe.stripeMod.IList
import typingsSlinky.stripe.stripeMod.IListPromise
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.StripeResource
import typingsSlinky.stripe.stripeMod.fileLinks.IFileLink
import typingsSlinky.stripe.stripeMod.fileLinks.IFileLinksCreationOptions
import typingsSlinky.stripe.stripeMod.fileLinks.IFileLinksListOptions
import typingsSlinky.stripe.stripeMod.fileLinks.IFileLinksUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.FileLinks")
@js.native
class FileLinks () extends StripeResource {
  def create(data: IFileLinksCreationOptions): js.Promise[IFileLink] = js.native
  /**
    * Creates a new file link object.
    */
  def create(data: IFileLinksCreationOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def create(data: IFileLinksCreationOptions, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def create(data: IFileLinksCreationOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def list(): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions): IListPromise[IFileLink] = js.native
  /**
    * Returns a list of file links
    */
  def list(data: IFileLinksListOptions, options: HeaderOptions): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions, options: HeaderOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(data: IFileLinksListOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(options: HeaderOptions): IListPromise[IFileLink] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def list(response: IResponseFn[IList[IFileLink]]): IListPromise[IFileLink] = js.native
  def retrieve(id: String): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IFileLink] = js.native
  /**
    * Returns a file link object if a valid identifier was provided, and throws an error otherwise.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def retrieve(id: String, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
  def update(id: String, data: IFileLinksUpdateOptions): js.Promise[IFileLink] = js.native
  /**
    * Updates an existing file link object. Expired links can no longer be updated. Returns the file link object if successful,
    * and throws an error otherwise.
    */
  def update(id: String, data: IFileLinksUpdateOptions, options: HeaderOptions): js.Promise[IFileLink] = js.native
  def update(
    id: String,
    data: IFileLinksUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IFileLink]
  ): js.Promise[IFileLink] = js.native
  def update(id: String, data: IFileLinksUpdateOptions, response: IResponseFn[IFileLink]): js.Promise[IFileLink] = js.native
}

