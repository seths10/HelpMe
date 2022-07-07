import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { AboutUsComponent } from './pages/about-us/about-us.component';
import { LandingPageComponent } from './pages/landing-page/landing-page.component';
import { TutorsComponent } from './pages/tutors/tutors.component';

const routes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'aboutUs', component: AboutUsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'landing-page', component: LandingPageComponent},
  { path: 'tutors', component: TutorsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
