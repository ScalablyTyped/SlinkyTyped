package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.sources.ISource
import typingsSlinky.stripe.mod.sources.ISourceCreationOptions
import typingsSlinky.stripe.mod.sources.ISourceRetrieveOptions
import typingsSlinky.stripe.mod.sources.ISourceUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Sources")
@js.native
class Sources () extends StripeResource {
  
  def create(data: ISourceCreationOptions): js.Promise[ISource] = js.native
  /** Create Source: https://stripe.com/docs/api/sources/create */
  def create(data: ISourceCreationOptions, options: HeaderOptions): js.Promise[ISource] = js.native
  def create(data: ISourceCreationOptions, options: HeaderOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def create(data: ISourceCreationOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  
  def retrieve(id: String): js.Promise[ISource] = js.native
  def retrieve(id: String, data: js.UndefOr[scala.Nothing], options: HeaderOptions): js.Promise[ISource] = js.native
  def retrieve(
    id: String,
    data: js.UndefOr[scala.Nothing],
    options: HeaderOptions,
    response: IResponseFn[ISource]
  ): js.Promise[ISource] = js.native
  def retrieve(id: String, data: js.UndefOr[scala.Nothing], response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions): js.Promise[ISource] = js.native
  /** Retrieve Source: https://stripe.com/docs/api/sources/retrieve */
  def retrieve(id: String, data: ISourceRetrieveOptions, options: HeaderOptions): js.Promise[ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions, options: HeaderOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  
  def update(id: String, data: ISourceUpdateOptions): js.Promise[ISource] = js.native
  /** Update Source: https://stripe.com/docs/api/sources/update */
  def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions): js.Promise[ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions, response: IResponseFn[ISource]): js.Promise[ISource] = js.native
}
