package typingsSlinky.std.global

import typingsSlinky.std.BufferSource
import typingsSlinky.std.WebAssembly.CompileError
import typingsSlinky.std.WebAssembly.Global
import typingsSlinky.std.WebAssembly.GlobalDescriptor
import typingsSlinky.std.WebAssembly.Imports
import typingsSlinky.std.WebAssembly.Instance
import typingsSlinky.std.WebAssembly.LinkError
import typingsSlinky.std.WebAssembly.Memory
import typingsSlinky.std.WebAssembly.MemoryDescriptor
import typingsSlinky.std.WebAssembly.Module
import typingsSlinky.std.WebAssembly.ModuleExportDescriptor
import typingsSlinky.std.WebAssembly.ModuleImportDescriptor
import typingsSlinky.std.WebAssembly.RuntimeError
import typingsSlinky.std.WebAssembly.Table
import typingsSlinky.std.WebAssembly.TableDescriptor
import typingsSlinky.std.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  class CompileErrorCls () extends CompileError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  class GlobalCls protected () extends Global {
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  class InstanceCls protected () extends Instance {
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  class LinkErrorCls () extends LinkError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  class MemoryCls protected () extends Memory {
    def this(descriptor: MemoryDescriptor) = this()
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module.customSections")
    @js.native
    def customSections(moduleObject: typingsSlinky.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[js.typedarray.ArrayBuffer] = js.native
    
    @JSGlobal("WebAssembly.Module.exports")
    @js.native
    def exports(moduleObject: typingsSlinky.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = js.native
    
    @JSGlobal("WebAssembly.Module.imports")
    @js.native
    def imports(moduleObject: typingsSlinky.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  class ModuleCls protected () extends Module {
    def this(bytes: BufferSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  class RuntimeErrorCls () extends RuntimeError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  class TableCls protected () extends Table {
    def this(descriptor: TableDescriptor) = this()
  }
  
  @JSGlobal("WebAssembly.compile")
  @js.native
  def compile(bytes: BufferSource): js.Promise[Module] = js.native
  
  @JSGlobal("WebAssembly.compileStreaming")
  @js.native
  def compileStreaming(source: js.Promise[org.scalajs.dom.experimental.Response]): js.Promise[Module] = js.native
  @JSGlobal("WebAssembly.compileStreaming")
  @js.native
  def compileStreaming(source: org.scalajs.dom.experimental.Response): js.Promise[Module] = js.native
  
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(moduleObject: Module): js.Promise[Instance] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = js.native
  
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: js.Thenable[org.scalajs.dom.experimental.Response]): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: js.Thenable[org.scalajs.dom.experimental.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: org.scalajs.dom.experimental.Response): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: org.scalajs.dom.experimental.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  
  @JSGlobal("WebAssembly.validate")
  @js.native
  def validate(bytes: BufferSource): scala.Boolean = js.native
}
