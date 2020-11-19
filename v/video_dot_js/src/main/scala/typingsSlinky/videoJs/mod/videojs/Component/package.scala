package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Component {
  
  /**
    * A callback that has no parameters and is bound into `Component`s context.
    */
  type GenericCallback = js.ThisFunction0[/* this */ typingsSlinky.videoJs.mod.videojs.Component, scala.Unit]
  
  /**
    * A callback that is called when a component is ready. Does not have any
    * parameters and any callback value will be ignored.
    */
  type ReadyCallback = js.ThisFunction0[/* this */ typingsSlinky.videoJs.mod.videojs.Component, scala.Unit]
}
