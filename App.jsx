import React from "react";
import { Admin, Resource } from 'react-admin';
import jsonServerProvider from 'ra-data-json-server';
import {PatientsList, PatientEdit, PatientsCreate} from './resources/PacientesList';
import {ConsultList,ConsultCreate,ConsultEdit} from './resources/ConsultList';
import {MedList,MedCreate} from './resources/MedList';

const dataProvider = jsonServerProvider('http://localhost:8080');
function App(){
	return(


<Admin dataProvider={dataProvider} >
<Resource name="paciente" list={PatientsList} edit={PatientEdit} create={PatientsCreate} />
<Resource name="medico" list={MedList} create={MedCreate} />
<Resource name="consulta" list={ConsultList} edit={ConsultEdit} create={ConsultCreate}/>
</Admin>
)
}

export default App;