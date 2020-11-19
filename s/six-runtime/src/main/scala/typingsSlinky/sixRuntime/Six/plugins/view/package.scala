package typingsSlinky.sixRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object view {
  
  type render = js.Function3[
    /* name */ java.lang.String, 
    /* runtimeConf */ js.UndefOr[typingsSlinky.sixRuntime.Six.plugins.view.runtimeConf | scala.Null], 
    /* data */ js.UndefOr[js.Object], 
    js.Promise[js.Any]
  ]
}
