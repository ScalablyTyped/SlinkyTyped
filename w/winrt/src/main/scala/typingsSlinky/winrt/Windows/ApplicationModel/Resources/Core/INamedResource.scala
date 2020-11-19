package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamedResource extends js.Object {
  
  var candidates: IVectorView[ResourceCandidate] = js.native
  
  def resolve(): ResourceCandidate = js.native
  def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
  
  def resolveAll(): IVectorView[ResourceCandidate] = js.native
  def resolveAll(resourceContext: ResourceContext): IVectorView[ResourceCandidate] = js.native
  
  var uri: Uri = js.native
}
