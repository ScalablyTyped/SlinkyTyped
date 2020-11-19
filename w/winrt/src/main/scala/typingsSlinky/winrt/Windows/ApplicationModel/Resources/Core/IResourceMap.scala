package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceMap extends IMapView[String, NamedResource] {
  
  def getSubtree(reference: String): ResourceMap = js.native
  
  def getValue(resource: String): ResourceCandidate = js.native
  def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
  
  var uri: Uri = js.native
}
