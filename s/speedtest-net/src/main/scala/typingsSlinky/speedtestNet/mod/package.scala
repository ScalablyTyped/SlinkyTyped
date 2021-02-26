package typingsSlinky.speedtestNet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): js.Promise[typingsSlinky.speedtestNet.mod.ResultEvent] = typingsSlinky.speedtestNet.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[typingsSlinky.speedtestNet.mod.ResultEvent]]
  @scala.inline
  def apply(options: typingsSlinky.speedtestNet.mod.Options): js.Promise[typingsSlinky.speedtestNet.mod.ResultEvent] = typingsSlinky.speedtestNet.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.speedtestNet.mod.ResultEvent]]
  
  type CancelFunction = js.Function2[
    /* setCancelHandler */ js.UndefOr[js.Symbol], 
    /* newHandler */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Boolean | scala.Unit
  ]
  
  type ProgressFunction = js.Function1[/* event */ js.UndefOr[typingsSlinky.speedtestNet.mod.SpeedTestEvent], scala.Unit]
  
  @scala.inline
  def defaultBinaryVersion: java.lang.String = typingsSlinky.speedtestNet.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultBinaryVersion").asInstanceOf[java.lang.String]
  
  @scala.inline
  def makeCancel(): typingsSlinky.speedtestNet.mod.CancelFunction = typingsSlinky.speedtestNet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCancel")().asInstanceOf[typingsSlinky.speedtestNet.mod.CancelFunction]
}
