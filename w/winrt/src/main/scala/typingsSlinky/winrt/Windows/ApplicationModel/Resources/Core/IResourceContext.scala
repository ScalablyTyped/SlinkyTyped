package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IObservableMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceContext extends js.Object {
  var languages: IVectorView[String] = js.native
  var qualifierValues: IObservableMap[String, String] = js.native
  def overrideToMatch(result: IIterable[ResourceQualifier]): Unit = js.native
  def reset(): Unit = js.native
  def reset(qualifierNames: IIterable[String]): Unit = js.native
}

