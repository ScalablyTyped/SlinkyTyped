package typingsSlinky.shelljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExecCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    js.Any
  ]
  
  type ShellArray = js.Array[java.lang.String] with typingsSlinky.shelljs.mod.ShellReturnValue
  
  @scala.inline
  def ShellString: typingsSlinky.shelljs.mod.ShellStringConstructor = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ShellString").asInstanceOf[typingsSlinky.shelljs.mod.ShellStringConstructor]
  type ShellString = java.lang.String with typingsSlinky.shelljs.mod.ShellReturnValue
  
  @scala.inline
  def cat: typingsSlinky.shelljs.mod.CatFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cat").asInstanceOf[typingsSlinky.shelljs.mod.CatFunction]
  
  @scala.inline
  def cd(): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cd")().asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
  @scala.inline
  def cd(dir: java.lang.String): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cd")(dir.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
  
  @scala.inline
  def chmod: typingsSlinky.shelljs.mod.ChmodFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("chmod").asInstanceOf[typingsSlinky.shelljs.mod.ChmodFunction]
  
  @scala.inline
  def config: typingsSlinky.shelljs.mod.ShellConfig = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[typingsSlinky.shelljs.mod.ShellConfig]
  
  @scala.inline
  def cp: typingsSlinky.shelljs.mod.CopyFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cp").asInstanceOf[typingsSlinky.shelljs.mod.CopyFunction]
  
  @scala.inline
  def dirs: typingsSlinky.shelljs.mod.DirsFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dirs").asInstanceOf[typingsSlinky.shelljs.mod.DirsFunction]
  
  @scala.inline
  def echo: typingsSlinky.shelljs.mod.EchoFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("echo").asInstanceOf[typingsSlinky.shelljs.mod.EchoFunction]
  
  @scala.inline
  def env: typingsSlinky.node.processMod.global.NodeJS.ProcessEnv = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("env").asInstanceOf[typingsSlinky.node.processMod.global.NodeJS.ProcessEnv]
  
  @scala.inline
  def error(): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
  
  @scala.inline
  def exec: typingsSlinky.shelljs.mod.ExecFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("exec").asInstanceOf[typingsSlinky.shelljs.mod.ExecFunction]
  
  @scala.inline
  def exit(): scala.Nothing = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[scala.Nothing]
  @scala.inline
  def exit(code: scala.Double): scala.Nothing = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def find: typingsSlinky.shelljs.mod.FindFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("find").asInstanceOf[typingsSlinky.shelljs.mod.FindFunction]
  
  @scala.inline
  def grep: typingsSlinky.shelljs.mod.GrepFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("grep").asInstanceOf[typingsSlinky.shelljs.mod.GrepFunction]
  
  @scala.inline
  def head: typingsSlinky.shelljs.mod.HeadFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("head").asInstanceOf[typingsSlinky.shelljs.mod.HeadFunction]
  
  @scala.inline
  def ln: typingsSlinky.shelljs.mod.LinkFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ln").asInstanceOf[typingsSlinky.shelljs.mod.LinkFunction]
  
  @scala.inline
  def ls: typingsSlinky.shelljs.mod.ListFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ls").asInstanceOf[typingsSlinky.shelljs.mod.ListFunction]
  
  @scala.inline
  def mkdir: typingsSlinky.shelljs.mod.MkdirFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mkdir").asInstanceOf[typingsSlinky.shelljs.mod.MkdirFunction]
  
  @scala.inline
  def mv: typingsSlinky.shelljs.mod.MoveFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mv").asInstanceOf[typingsSlinky.shelljs.mod.MoveFunction]
  
  @scala.inline
  def popd: typingsSlinky.shelljs.mod.PopDirFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("popd").asInstanceOf[typingsSlinky.shelljs.mod.PopDirFunction]
  
  @scala.inline
  def pushd: typingsSlinky.shelljs.mod.PushDirFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pushd").asInstanceOf[typingsSlinky.shelljs.mod.PushDirFunction]
  
  @scala.inline
  def pwd(): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pwd")().asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
  
  @scala.inline
  def rm: typingsSlinky.shelljs.mod.RemoveFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("rm").asInstanceOf[typingsSlinky.shelljs.mod.RemoveFunction]
  
  @scala.inline
  def sed: typingsSlinky.shelljs.mod.SedFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sed").asInstanceOf[typingsSlinky.shelljs.mod.SedFunction]
  
  @scala.inline
  def set(options: java.lang.String): scala.Unit = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def sort: typingsSlinky.shelljs.mod.SortFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sort").asInstanceOf[typingsSlinky.shelljs.mod.SortFunction]
  
  @scala.inline
  def tail: typingsSlinky.shelljs.mod.TailFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("tail").asInstanceOf[typingsSlinky.shelljs.mod.TailFunction]
  
  @scala.inline
  def tempdir(): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tempdir")().asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
  
  @scala.inline
  def test(option: typingsSlinky.shelljs.mod.TestOptions, path: java.lang.String): scala.Boolean = (typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("test")(option.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def touch: typingsSlinky.shelljs.mod.TouchFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("touch").asInstanceOf[typingsSlinky.shelljs.mod.TouchFunction]
  
  @scala.inline
  def uniq: typingsSlinky.shelljs.mod.UniqFunction = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("uniq").asInstanceOf[typingsSlinky.shelljs.mod.UniqFunction]
  
  @scala.inline
  def which(command: java.lang.String): typingsSlinky.shelljs.mod.ShellString = typingsSlinky.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("which")(command.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.shelljs.mod.ShellString]
}
