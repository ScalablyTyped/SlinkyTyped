package typingsSlinky.stylableNode

import typingsSlinky.std.ReturnType
import typingsSlinky.std.Set
import typingsSlinky.stylableNode.anon.Errors
import typingsSlinky.stylableNode.anon.FnCall
import typingsSlinky.stylableNode.anon.PartialOptions
import typingsSlinky.stylableNode.findFilesMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/node", "attachHook")
  @js.native
  def attachHook(): Unit = js.native
  @JSImport("@stylable/node", "attachHook")
  @js.native
  def attachHook(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules: PartialOptions): Unit = js.native
  
  @JSImport("@stylable/node", "findFiles")
  @js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = js.native
  @JSImport("@stylable/node", "findFiles")
  @js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = js.native
  
  @JSImport("@stylable/node", "resolveNamespace")
  @js.native
  val resolveNamespace: ReturnType[FnCall] = js.native
  
  @JSImport("@stylable/node", "resolveNamespaceFactory")
  @js.native
  def resolveNamespaceFactory(): ReturnType[FnCall] = js.native
  @JSImport("@stylable/node", "resolveNamespaceFactory")
  @js.native
  def resolveNamespaceFactory(hashSalt: js.UndefOr[scala.Nothing], prefix: String): ReturnType[FnCall] = js.native
  @JSImport("@stylable/node", "resolveNamespaceFactory")
  @js.native
  def resolveNamespaceFactory(hashSalt: String): ReturnType[FnCall] = js.native
  @JSImport("@stylable/node", "resolveNamespaceFactory")
  @js.native
  def resolveNamespaceFactory(hashSalt: String, prefix: String): ReturnType[FnCall] = js.native
}
