package typingsSlinky.yeomanEnvironment.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.memFs.mod.Store
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.yeomanEnvironment.anon.TypeofGenerator
import typingsSlinky.yeomanGenerator.mod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment[O /* <: Options */] extends EventEmitter {
  
  /* private */ def _tryRegistering(generatorReference: String): Unit = js.native
  
  def alias(`match`: String, value: String): Unit = js.native
  def alias(`match`: js.RegExp, value: String): Unit = js.native
  
  var aliases: js.Array[Alias] = js.native
  
  var arguments: js.Array[String] = js.native
  
  def create(name: String, options: js.Object): Unit = js.native
  
  var cwd: String = js.native
  
  def error(err: js.Object): js.Error = js.native
  def error(err: js.Error): js.Error = js.native
  
  def findGeneratorsIn(list: js.Array[String]): js.Array[String] = js.native
  
  def get(namespace: String): typingsSlinky.yeomanGenerator.mod.^  | Null = js.native
  
  def getByPath(path: String): typingsSlinky.yeomanGenerator.mod.^  | Null = js.native
  
  def getGeneratorNames(): js.Array[String] = js.native
  
  def getGeneratorsMeta(): StringDictionary[GeneratorMeta] = js.native
  
  def getNpmPaths(): js.Array[String] = js.native
  
  def help(name: String): String = js.native
  
  def instantiate(name: String, options: InstantiateOptions): typingsSlinky.yeomanGenerator.mod.^ = js.native
  
  def lookup(): Unit = js.native
  def lookup(cb: js.Function1[/* err */ Null | js.Error, Unit]): Unit = js.native
  
  var lookups: js.Array[String] = js.native
  
  def namespace(filepath: String): String = js.native
  
  def namespaces(): js.Array[String] = js.native
  
  var options: O = js.native
  
  def register(name: String): String = js.native
  def register(name: String, namespace: String): String = js.native
  
  def registerStub(
    generator: (Instantiable2[/* args */ String, /* options */ js.Object, typingsSlinky.yeomanGenerator.mod.^]) with TypeofGenerator,
    namespace: String
  ): this.type = js.native
  
  def resolveModulePath(moduleId: String): String = js.native
  
  def run(args: String, done: RunDone): Unit = js.native
  def run(args: String, options: js.Object, done: RunDone): Unit = js.native
  def run(args: js.Array[String], done: RunDone): Unit = js.native
  def run(args: js.Array[String], options: js.Object, done: RunDone): Unit = js.native
  def run(done: RunDone): Unit = js.native
  
  var sharedFs: Store = js.native
  
  var store: Storage = js.native
}
