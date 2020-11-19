package typingsSlinky.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpack.webpackBooleans.`true`
import typingsSlinky.webpack.webpackStrings.empty
import typingsSlinky.webpack.webpackStrings.mock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOptions
  extends /**
	 * Include a polyfill for the node.js module
	 */
/* k */ StringDictionary[`false` | `true` | mock | empty] {
  
  /**
  	 * Include a polyfill for the 'Buffer' variable
  	 */
  var Buffer: js.UndefOr[`false` | `true` | mock] = js.native
  
  /**
  	 * Include a polyfill for the '__dirname' variable
  	 */
  var __dirname: js.UndefOr[`false` | `true` | mock] = js.native
  
  /**
  	 * Include a polyfill for the '__filename' variable
  	 */
  var __filename: js.UndefOr[`false` | `true` | mock] = js.native
  
  /**
  	 * Include a polyfill for the 'console' variable
  	 */
  var console: js.UndefOr[`false` | `true` | mock] = js.native
  
  /**
  	 * Include a polyfill for the 'global' variable
  	 */
  var global: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Include a polyfill for the 'process' variable
  	 */
  var process: js.UndefOr[`false` | `true` | mock] = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuffer(value: `false` | `true` | mock): Self = this.set("Buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("Buffer", js.undefined)
    
    @scala.inline
    def set__dirname(value: `false` | `true` | mock): Self = this.set("__dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__dirname: Self = this.set("__dirname", js.undefined)
    
    @scala.inline
    def set__filename(value: `false` | `true` | mock): Self = this.set("__filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__filename: Self = this.set("__filename", js.undefined)
    
    @scala.inline
    def setConsole(value: `false` | `true` | mock): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setProcess(value: `false` | `true` | mock): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
  }
}
