import { NgModule } from '@angular/core';
import { BrowserModule} from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { AboutUsComponent } from './pages/about-us/about-us.component';
import { LandingPageComponent } from './pages/landing-page/landing-page.component';
import { TutorsComponent } from './pages/tutors/tutors.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AboutUsComponent,
    LandingPageComponent,
    TutorsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
