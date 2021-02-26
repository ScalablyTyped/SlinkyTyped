package typingsSlinky.tripleBeam

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("triple-beam", "LEVEL")
  @js.native
  val LEVEL: js.Symbol = js.native
  
  @JSImport("triple-beam", "MESSAGE")
  @js.native
  val MESSAGE: js.Symbol = js.native
  
  @JSImport("triple-beam", "SPLAT")
  @js.native
  val SPLAT: js.Symbol = js.native
  
  @JSImport("triple-beam", "configs")
  @js.native
  val configs: Configs_ = js.native
  
  @js.native
  trait Config extends StObject {
    
    val colors: StringDictionary[String] = js.native
    
    val levels: StringDictionary[Double] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(colors: StringDictionary[String], levels: StringDictionary[Double]): Config = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: StringDictionary[Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Configs_ extends StObject {
    
    val cli: Config = js.native
    
    val npm: Config = js.native
    
    val syslog: Config = js.native
  }
  object Configs_ {
    
    @scala.inline
    def apply(cli: Config, npm: Config, syslog: Config): Configs_ = {
      val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configs_]
    }
    
    @scala.inline
    implicit class Configs_MutableBuilder[Self <: Configs_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCli(value: Config): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpm(value: Config): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyslog(value: Config): Self = StObject.set(x, "syslog", value.asInstanceOf[js.Any])
    }
  }
}
