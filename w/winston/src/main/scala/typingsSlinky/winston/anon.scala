package typingsSlinky.winston

import typingsSlinky.winston.configMod.CliConfigSetColors
import typingsSlinky.winston.configMod.CliConfigSetLevels
import typingsSlinky.winston.configMod.NpmConfigSetColors
import typingsSlinky.winston.configMod.NpmConfigSetLevels
import typingsSlinky.winston.configMod.SyslogConfigSetColors
import typingsSlinky.winston.configMod.SyslogConfigSetLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bearer extends StObject {
    
    var bearer: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object Bearer {
    
    @scala.inline
    def apply(): Bearer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bearer]
    }
    
    @scala.inline
    implicit class BearerMutableBuilder[Self <: Bearer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Colors extends StObject {
    
    var colors: CliConfigSetColors = js.native
    
    var levels: CliConfigSetLevels = js.native
  }
  object Colors {
    
    @scala.inline
    def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: CliConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: CliConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColorsLevels extends StObject {
    
    var colors: SyslogConfigSetColors = js.native
    
    var levels: SyslogConfigSetLevels = js.native
  }
  object ColorsLevels {
    
    @scala.inline
    def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorsLevels]
    }
    
    @scala.inline
    implicit class ColorsLevelsMutableBuilder[Self <: ColorsLevels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: SyslogConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: SyslogConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Levels extends StObject {
    
    var colors: NpmConfigSetColors = js.native
    
    var levels: NpmConfigSetLevels = js.native
  }
  object Levels {
    
    @scala.inline
    def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Levels]
    }
    
    @scala.inline
    implicit class LevelsMutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: NpmConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: NpmConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
}
