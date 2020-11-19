package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesAPI extends js.Object {
  
  def add(data: FileContent): js.Promise[js.Array[IPFSFile]] = js.native
  def add(data: FileContent, callback: Callback[js.Array[IPFSFile]]): Unit = js.native
  def add(data: FileContent, options: js.Any): js.Promise[js.Array[IPFSFile]] = js.native
  def add(data: FileContent, options: js.Any, callback: Callback[js.Array[IPFSFile]]): Unit = js.native
  
  def cat(hash: Multihash): js.Promise[FileContent] = js.native
  def cat(hash: Multihash, callback: Callback[FileContent]): Unit = js.native
  
  def createAddStream(callback: Callback[_]): Unit = js.native
  def createAddStream(options: js.Any, callback: Callback[_]): Unit = js.native
  
  def createPullStream(options: js.Any): js.Any = js.native
  
  def get(hash: Multihash): js.Promise[IPFSFile | js.Array[IPFSGetResult]] = js.native
  def get(hash: Multihash, callback: Callback[IPFSFile | js.Array[IPFSGetResult]]): Unit = js.native
  
  def getPull(hash: Multihash, callback: Callback[_]): Unit = js.native
}
