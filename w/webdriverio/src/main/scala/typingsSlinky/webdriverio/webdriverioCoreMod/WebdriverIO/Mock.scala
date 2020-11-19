package typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mock extends js.Object {
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def abort(errorCode: ErrorCode): js.Promise[Unit] = js.native
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def abortOnce(errorCode: ErrorCode): js.Promise[Unit] = js.native
  
  /**
    * list of requests made by the browser to that mock
    */
  var calls: js.Array[Matches] = js.native
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def clear(): js.Promise[Unit] = js.native
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def respond(overwrites: MockOverwrite): js.Promise[Unit] = js.native
  def respond(overwrites: MockOverwrite, params: MockResponseParams): js.Promise[Unit] = js.native
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def respondOnce(overwrites: MockOverwrite): js.Promise[Unit] = js.native
  def respondOnce(overwrites: MockOverwrite, params: MockResponseParams): js.Promise[Unit] = js.native
  
  /**
    * > This is a __beta__ feature. Please give us feedback and file [an issue](https://github.com/webdriverio/webdriverio/issues/new/choose) if certain scenarions don't work as expected!
    */
  def restore(): js.Promise[Unit] = js.native
}
