package typingsSlinky.xlsx.mod

import typingsSlinky.cfb.mod.CFBBlob
import typingsSlinky.cfb.mod.CFBContainer
import typingsSlinky.cfb.mod.CFBEntry
import typingsSlinky.cfb.mod.CFBParsingOptions
import typingsSlinky.cfb.mod.CFBUtils
import typingsSlinky.cfb.mod.CFBWritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CFB {
  
  @JSImport("xlsx", "CFB.CFB$EntryType")
  @js.native
  object CFBEntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cfb.mod.CFBEntryType with Double] = js.native
    
    /* 3 */ val lockbytes: typingsSlinky.cfb.mod.CFBEntryType.lockbytes with Double = js.native
    
    /* 4 */ val property: typingsSlinky.cfb.mod.CFBEntryType.property with Double = js.native
    
    /* 5 */ val root: typingsSlinky.cfb.mod.CFBEntryType.root with Double = js.native
    
    /* 1 */ val storage: typingsSlinky.cfb.mod.CFBEntryType.storage with Double = js.native
    
    /* 2 */ val stream: typingsSlinky.cfb.mod.CFBEntryType.stream with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.cfb.mod.CFBEntryType.unknown with Double = js.native
  }
  
  @JSImport("xlsx", "CFB.CFB$StorageType")
  @js.native
  object CFBStorageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cfb.mod.CFBStorageType with Double] = js.native
    
    /* 0 */ val fat: typingsSlinky.cfb.mod.CFBStorageType.fat with Double = js.native
    
    /* 1 */ val minifat: typingsSlinky.cfb.mod.CFBStorageType.minifat with Double = js.native
  }
  
  @JSImport("xlsx", "CFB.find")
  @js.native
  def find(cfb: CFBContainer, path: String): CFBEntry | Null = js.native
  
  @JSImport("xlsx", "CFB.parse")
  @js.native
  def parse(f: CFBBlob): CFBContainer = js.native
  @JSImport("xlsx", "CFB.parse")
  @js.native
  def parse(f: CFBBlob, options: CFBParsingOptions): CFBContainer = js.native
  
  @JSImport("xlsx", "CFB.read")
  @js.native
  def read(f: String): CFBContainer = js.native
  @JSImport("xlsx", "CFB.read")
  @js.native
  def read(f: String, options: CFBParsingOptions): CFBContainer = js.native
  @JSImport("xlsx", "CFB.read")
  @js.native
  def read(f: CFBBlob): CFBContainer = js.native
  @JSImport("xlsx", "CFB.read")
  @js.native
  def read(f: CFBBlob, options: CFBParsingOptions): CFBContainer = js.native
  
  @JSImport("xlsx", "CFB.utils")
  @js.native
  val utils: CFBUtils = js.native
  
  @JSImport("xlsx", "CFB.version")
  @js.native
  val version: String = js.native
  
  @JSImport("xlsx", "CFB.write")
  @js.native
  def write(cfb: CFBContainer): js.Any = js.native
  @JSImport("xlsx", "CFB.write")
  @js.native
  def write(cfb: CFBContainer, options: CFBWritingOptions): js.Any = js.native
  
  @JSImport("xlsx", "CFB.writeFile")
  @js.native
  def writeFile(cfb: CFBContainer, filename: String): js.Any = js.native
  @JSImport("xlsx", "CFB.writeFile")
  @js.native
  def writeFile(cfb: CFBContainer, filename: String, options: CFBWritingOptions): js.Any = js.native
}
