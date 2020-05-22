package typingsSlinky.winrt.global.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
@js.native
class BitmapProperties ()
  extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapProperties {
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
  /* CompleteClass */
  override def setPropertiesAsync(
    propertiesToSet: IIterable[
      IKeyValuePair[String, typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
    ]
  ): IAsyncAction = js.native
}

